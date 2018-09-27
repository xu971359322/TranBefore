$(function () {

    $("[name=orderPlace]").blur(function () {
        // 百度地图API功能
        var map = new BMap.Map("allmap");
        var point = new BMap.Point(116.331398,39.897445);
        map.centerAndZoom(point,12);
        // 创建地址解析器实例
        var myGeo = new BMap.Geocoder();
        // 将地址解析结果显示在地图上,并调整地图视野
        myGeo.getPoint($("[name=orderPlace]").val(), function(point){
            if (point) {
                map.centerAndZoom(point, 16);
                map.addOverlay(new BMap.Marker(point));
                //alert('您的位置：'+point.lng+','+point.lat);
                $.ajax({
                    url:"/order/getBranch",
                    type:"post",
                    dataType:"json",
                    data:{"lng":point.lng,"lat":point.lat},
                    success:function (data) {
                        alert(data.branch.bX+"  "+data.branch.bY);
                        $("[name=bId]").val("");
                        var map = new BMap.Map("allmap");
                        var po =  new BMap.Point(data.branch.bX,data.branch.bY);
                        map.centerAndZoom(po, 12);
                        var marker = new BMap.Marker(po);  // 创建标注
                        map.addOverlay(marker);
                        var label = new BMap.Label(data.branch.bName,{offset:new BMap.Size(20,-10)});
                        setTimeout(function(){
                            map.setZoom(14);
                        }, 2000);  //2秒后放大到14级
                        map.enableScrollWheelZoom(true);
                        marker.setLabel(label);

                    },error:function () {
                        alert("ajax出错");
                    }
                });
            }else{
                alert("您选择地址没有解析到结果!");
            }
        }, "武汉市");
    });
    
    $("[name=orderType]").change(function () {
        var money =$("[name=orderMonry]").val();
        var orderType =$("[name=orderType]").val();
        if(orderType=='普通件'){
            price();
        }else{
            $("[name=orderMonry]").val(money*1.1);
            $("#priceSpan").html(money*1.1+"元");
        }
    });
    
    $("[name=orderWeight]").blur(function () {
        price();
    });
})

function price() {
    var first =$("#first").val();
    var second =$("#second").val();
    var weight =$("[name=orderWeight]").val();
    if(first==-1 || second ==-1){
        $("#placeSpan").html("请选择寄件和收件地址");
        return;
    }else{
        $("#placeSpan").html("");
        $.ajax({
            url:"/client/selDetailMoney",
            type:"post",
            //contentType:"application/json;charset=utf-8",
            dataType:"json",
            data:{"first":first,"second":second},
            success:function (data) {
                //alert(data.detail.weight_first+" "+data.detail.weight_next+" "+weight);
                if(weight<=2){
                    $("#priceSpan").html(weight*data.detail.weight_first+"元");
                    $("[name=orderMonry]").val(price);

                }else {
                    var price= data.detail.weight_first*2+(weight-2)*data.detail.weight_next;
                    $("[name=orderMonry]").val(price);
                    $("#priceSpan").html(price+"元");
                }
            },error:function () {
                alert("ajax出错");
            }
        })
    }
}
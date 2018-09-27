$(function () {

    $("[name=weight]").blur(function () {
        var first =$("#first").val();
        var second =$("#second").val();
        var weight =$("[name=weight]").val();
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
                        $("#priceSpan").html("预算价格为："+weight*data.detail.weight_first+"元");
                    }else {
                        var price= data.detail.weight_first*2+(weight-2)*data.detail.weight_next;
                        $("#priceSpan").html("预算价格为："+price+"元");
                    }
                },error:function () {
                    alert("ajax出错");
                }
            })
        }
    });

    $("#first").change(function () {
        $.ajax({
            url:"/client/selProvincialMoney",
            type:"post",
            contentType:"application/json;charset=utf-8",
            data:$("#first").val(),
            //dataType:"json",
            // data:{"id":$("#city").val()},
            success:function (data) {
                var test ="<table class=\"table table-striped\" align=\"center\">\n" +
                    "\t\t\t\t\t<thead id=\"thead\">\n" +
                    "\t\t\t\t\t<tr align='center'>\n" +
                    "\t\t\t\t\t\t<th>首重(2kg)</th>\n" +
                    "\t\t\t\t\t\t<th>超过首重每千克</th>\n" +
                    "\t\t\t\t\t\t<th>目的地</th>\n" +
                    "\t\t\t\t\t</tr>\n" +
                    "\t\t\t\t\t</thead><tbody>";
                $.each(data,function (k,v) {
                    test+="<tr align='center'>";
                    test+="<td>"+v.weight_first+"元</td>"
                    test+="<td>"+v.weight_next+"元</td>"
                    test+="<td>"+v.city+"</td>"
                    test+="</tr>";

                });
                test+="</tbody>\t</table>";

                $("#mydiv").html(test);
            },error:function () {
                alert("ajax出错")
            }

        })
    });
});
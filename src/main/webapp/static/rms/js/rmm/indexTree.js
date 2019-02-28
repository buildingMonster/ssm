layui.use(['jquery','tree','element','layer'], function(){
    var $ = layui.jquery;
    var layer = layui.layer;
    var element = layui.element;

        $.ajax({
            url : '/ssm/rms/rmm/rightJson',
            //data : jsonData,
            dataType : 'json',
            success : function(data){
                var node = data;
                layui.tree({
                    elem : '#indexTree', // 传入元素选择器
                    nodes : data,
//						spread : true,
                    click : function(node){
                        var element = layui.element;
                        var exist = $("li[lay-id='" + node.id + "']").length;//判断是不是用重复的选项卡
                        if (exist > 0) {
                            element.tabChange('tabs', node.id);// 切换到已有的选项卡
                        } else {
                            if (node.attributes.right_url != null && node.attributes.right_url != "") {// 判断是否需要新增选项卡
                                element.tabAdd('tabs', {
                                    title: node.name,
                                    content: '<iframe scrolling="yes" frameborder="0" src="' + node.attributes.right_url + '?key='+node.id+'&ID='+usr_id+'" width="99%" height="99%"></iframe>',// 支持传入htmlc
                                    id: node.id
                                });
                                element.tabChange('tabs', node.id);
                            }
                        }
                    }
                });
            }
        });



    var myTime = setInterval("clock_12h()",1000);

});

function clock_12h()
{

    var today = new Date(); //获得当前时间
    //获得年、月、日，Date()函数中的月份是从0－11计算
    var year = today.getFullYear();
    var month = today.getMonth()+1;
    var date = today.getDate();
    var hour = today.getHours();  //获得小时、分钟、秒
    var minute = today.getMinutes();
    var second = today.getSeconds();

    var apm="AM"; //默认显示上午: AM
    if (hour>12) //按12小时制显示
    {
        hour=hour-12;
        apm="PM"  ;
    }
    var weekday = 0;
    switch(today.getDay()){
        case 0:
            weekday = "星期日";
            break;
        case 1:
            weekday = "星期一";
            break;
        case 2:
            weekday = "星期二";
            break;
        case 3:
            weekday = "星期三";
            break;
        case 4:
            weekday = "星期四";
            break;
        case 5:
            weekday = "星期五";
            break;
        case 6:
            weekday = "星期六";
            break;
    }
    var now=new Date();
    var hour=now.getHours();
    var str;
    if (hour>=0 && hour<=12) {
        str="上午好！";
    } else if(hour>12 && hour<=18){
        str="下午好！"
    } else{
        str="晚上好！"
    }

    /*设置div的内容为当前时间*/
    document.getElementById("myclock").innerHTML="<br><br>&nbsp;&nbsp;&nbsp;&nbsp;<font size=+4>欢迎回来，管理员</font> <h5>"+year+"年"+month+"月"+date+"日&nbsp;"+hour+":"+minute+":"+second+"&nbsp;"+apm+"&nbsp;"+weekday+"</h5>";
}






var app = new Vue({
   el:'#basdictImage',
    data:{
       students : queryBasdictImage()
    }
})

function queryBasdictImage() {
    var code;
    $.ajax("/ssm/queryBasdictPager",{
        type:"POST",
        async : false
        //dataType : "JSON",
        ,success: function (data) {
            code = data;
        }
    });
    return code;
}
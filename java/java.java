
$(document).ready(function(){
    $(window).scroll(function(){
        if($(window).scrollTop() > $(window).height()){
            $(".navbar").css({"background-color":"lightgray"});   
        }
        else{
            $(".navbar").css({"background-color":"white"});
        }

    })
})

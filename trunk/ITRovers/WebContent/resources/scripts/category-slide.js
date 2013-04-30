$(document).ready(function () {

    chainAnim('.section', 150, '1');
    //Get all the LI from the #tabMenu UL
    $('.tabMenu > li').click(function () {
        $('.tabMenu > li').addClass('OpacityInject');
        $('.subnav').css("display", "none");
        $('.boxBody > div > ul > li').removeClass('category-open');
        $('.boxBody > div > ul > li').addClass('category-closed');
        var className;
        if ($('.boxBody div:eq(' + $('.tabMenu > li').index(this) + ')').attr("style") == "display: block;") {
            // Hide all the DIV in .boxBody
            $('.boxBody div').slideUp('1500');
            //remove the selected class from all LI    
            $('.tabMenu > li').removeClass('selected');
            $('.tabMenu > li').removeClass('OpacityInject');
        }
        else {
            //Reassign the LI
            $(this).addClass('selected');
            $(this).removeClass('OpacityInject');
            //Hide all the DIV in .boxBody
            $('.boxBody div').slideUp('1500');
            //Look for the right DIV in boxBody according to the Navigation UL index, therefore, the arrangement is very important.
            $('.boxBody div:eq(' + $('.tabMenu > li').index(this) + ')').slideDown('1500');
            $('.boxBody > div > ul > li').addClass('category-closed');
        }
    }).mouseover(function () {
        //Add and remove class, Personally I dont think this is the right way to do it, anyone please suggest    
        $(this).addClass('mouseover');
        $(this).removeClass('mouseout');
        //$(this).removeClass('OpacityInject');
    }).mouseout(function () {
        //Add and remove class
        $(this).addClass('mouseout');
        $(this).removeClass('mouseover');
    });

    //Mouseover with animate Effect for Category menu list
    $('.boxBody #category li').mouseover(function () {
        //Change background color and animate the padding
        $(this).css('backgroundColor', '#f6f6f6');
        $(this).children().animate({ paddingLeft: "20px" }, { queue: false, duration: 300 });
    }).mouseout(function () {

        //Change background color and animate the padding
        $(this).css('backgroundColor', '');
        $(this).children().animate({ paddingLeft: "0" }, { queue: false, duration: 300 });
    });

    //Mouseover effect for Posts, Comments, Famous Posts and Random Posts menu list.

    $('.boxBody li').click(function (event) {
        $('.boxBody li').removeClass('category-open');
        $('.boxBody li').addClass('category-closed');
        if ($(this).children(':first-child').attr("style") == "display: block;") {
            $('.subnav').slideUp('1500');
            $(this).children(':first-child').removeClass('showUl');
            $(this).children(':first-child').addClass('hideUl');
            /* Left Icon Change*/
            $(this).children(':first:child').removeClass('category-open');
            $(this).children(':first:child').addClass('category-closed');
        }
        else {
            $('.subnav').slideUp('1500');
            $(this).children(':first-child').removeClass('hideUl');
            $(this).children(':first-child').addClass('showUl');
            $(this).children(':first-child').slideDown('18000');
            $(this).children(':first-child').css("display", "block");
            /* Left Icon Change*/
            $(this).removeClass('category-closed');
            $(this).addClass('category-open');
        }

        //        $('.subnav li').click(function (event) {
        //            return false;
        //        })
        $('.subnav li').mouseover(function () {
            $(this).addClass('sublimouseover');
        }).mouseout(function () {
            $(this).removeClass('sublimouseover');
        });
    }).mouseover(function () {
        $(this).css('backgroundColor', '#f6f6f6');
    }).mouseout(function () {
        $(this).css('backgroundColor', '');
    });


    function chainAnim(e, s, o) {
        var $fade = $(e);
        var code = function () { console.log('Done.'); };
        $fade.each(function (i) {
            $(this).delay(i * s).fadeTo(s, o);
        });
    }
});
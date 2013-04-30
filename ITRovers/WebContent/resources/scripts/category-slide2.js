$(document).ready(function () {

    chainAnim('.section', 150, '1');
    //Get all the LI from the #tabMenu UL
    $('.tabMenu > li').click(function () {
        $('.tabMenu > li').addClass('OpacityInject');
        $('.L3').css("display", "none");
        $('.boxBody > L2 .category-sub').removeClass('category-open');
        $('.boxBody > L2 .category-sub').addClass('category-closed');
        var className;
        if ($('.boxBody .L2:eq(' + $('.tabMenu > li').index(this) + ')').attr("style") == "display: block;") {
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

            $('.boxBody .L2:eq(' + $('.tabMenu > li').index(this) + ')').children("div").css("display", "block");
            $('.boxBody .L2:eq(' + $('.tabMenu > li').index(this) + ')').children("div").children("div").css("display", "block");
            $('.boxBody .L2:eq(' + $('.tabMenu > li').index(this) + ')').slideDown('1500');
            $('.boxBody .L2:eq(' + $('.tabMenu > li').index(this) + ')').children("div").children("div").children("a").addClass('category-closed');
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

    $('.category-sub div a').click(function (event) {
        //        initiateCollapseControl($("#divCatalog"), 'Catalog');
        $('.category-sub div a').removeClass('category-open');
        $('.category-sub div a').addClass('category-closed');
        $('.boxBody li').addClass('category-closed');
        var text = $(this).text();
        if ($(this).parent().children('ul').attr("style") == "display: block;") {
            $('.L3').slideUp('1500');
            $(this).parent().children('ul').removeClass('showUl');
            $(this).parent().children('ul').addClass('hideUl');
            /* Left Icon Change*/
            $(this).parent().children('ul').children('li').removeClass('category-open');
            $(this).addClass('category-closed');
            /*Code for col panel*/
            $('.L2').slideUp('1500');
            $('.L2').css("display", "none");
            $('#CatalogPanel').hide("slow()");
            if (text == "Business Card") {
                //                $("#listing1").css("display", "block");
                $("#listing1").toggle(550);
            }
            else {
                //                $("#listing2").css("display", "block");
                $("#listing2").toggle(550);
            }

            /*Code for col panel*/
        }
        else {

            $('.L3').slideUp('1500');
            $(this).parent().children('ul').removeClass('hideUl');
            $(this).parent().children('ul').addClass('showUl');
            $(this).parent().children('ul').slideDown('18000');
            $(this).parent().children('ul').css("display", "block");
            /* Left Icon Change*/
            $(this).removeClass('category-closed');
            $(this).addClass('category-open');
            /*Code for col panel*/
            $('.L2').slideUp('1500');
            $('.L2').css("display", "none");
            $('#CatalogPanel').hide("slow()");
            if (text == "Business Card") {
//                $("#listing1").css("display", "block");
                $("#listing1").toggle(550);
            }
            else {
//                $("#listing2").css("display", "block");
                $("#listing2").toggle(550);
            }

            /*Code for col panel*/
        }

        $("#ancCatalog").css("display", "inline");
        $('.L3 li').mouseover(function () {
            $(this).addClass('sublimouseover');
        }).mouseout(function () {
            $(this).removeClass('sublimouseover');
        });
    }).mouseover(function () {
        $(this).css('backgroundColor', '#f6f6f6');
    }).mouseout(function () {
        $(this).css('backgroundColor', '');
    });
    //            $('.subnav li').click(function (event) {
    //                return false;
    //            })

    function chainAnim(e, s, o) {
        var $fade = $(e);
        var code = function () { console.log('Done.'); };
        $fade.each(function (i) {
            $(this).delay(i * s).fadeTo(s, o);
        });
    }
});
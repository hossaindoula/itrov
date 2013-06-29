<#import "../template/admin_layout.ftl" as layout>
<@layout.admin_layout "${PageTitle}" >



<div class="rightpanel">

    <ul class="breadcrumbs">
        <li><a href="dashboard.html"><i class="iconfa-home"></i></a> <span class="separator"></span></li>
        <li><a href="forms.html">Forms</a> <span class="separator"></span></li>
        <li>Form Styles</li>

        <li class="right">
            <a href="" data-toggle="dropdown" class="dropdown-toggle"><i class="icon-tint"></i> Color Skins</a>
            <ul class="dropdown-menu pull-right skin-color">
                <li><a href="default">Default</a></li>
                <li><a href="navyblue">Navy Blue</a></li>
                <li><a href="palegreen">Pale Green</a></li>
                <li><a href="red">Red</a></li>
                <li><a href="green">Green</a></li>
                <li><a href="brown">Brown</a></li>
            </ul>
        </li>
    </ul>

    <div class="pageheader">
        <form action="" method="post" class="searchbar">
            <input type="text" name="keyword" placeholder="To search type and hit enter..." />
        </form>
        <div class="pageicon"><span class="iconfa-pencil"></span></div>
        <div class="pagetitle">
            <h5>Authority</h5>
            <h1>Create Authority</h1>
        </div>
    </div><!--pageheader-->

    <div class="maincontent">
        <div class="maincontentinner">



            <div class="widgetbox box-inverse">
                <h4 class="widgettitle">Please Enter Authority informations</h4>
                <div class="widgetcontent wc1">
                    <form id="form1" class="stdform" method="post" action="saveFeatureData.itr">
                        <div class="par control-group">
                            <label class="control-label" for="authorityname">FEATURE COMPONENT</label>
                            <div class="controls"><input type="text" name="authorityname" id="authorityname" class="input-large" /></div>
                        </div>

                        <div class="par control-group">
                            <label class="control-label" for="authorityname">FEATURE OPERATION</label>
                            <div class="controls"><input type="text" name="authorityname" id="authorityname" class="input-large" /></div>
                        </div>

                        <div class="par control-group">
                            <label class="control-label" for="authoritydescription">DESCRIPTION</label>
                            <div class="controls"><input type="text" name="authoritydescription" id="authoritydescription" class="input-large" /></div>
                        </div>

                        <p class="stdformbutton">
                            <button class="btn btn-primary"> SUBMIT </button>
                        </p>
                    </form>
                </div><!--widgetcontent-->
            </div><!--widget-->




            <div class="footer">
                <div class="footer-left">
                    <span>&copy; 2013. ITRovers PTY Ltd. All Rights Reserved.</span>
                </div>
                <div class="footer-right">
                    <span>ITRovers</span>
                </div>
            </div><!--footer-->

        </div><!--maincontentinner-->
    </div><!--maincontent-->

</div><!--rightpanel-->

</@layout.admin_layout>
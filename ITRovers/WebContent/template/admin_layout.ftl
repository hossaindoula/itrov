<#macro admin_layout title="">
    <!-- Header content -->
        <#include "admin_header.ftl"/>
    <!-- Header content -->

    <!-- Nav Bar -->
        <#include "nav_panel.ftl">
    <!-- Nav Bar -->

    <!--Body content-->
        <#nested>
    <!--Body content-->

    <!-- Footer content -->
        <#include "admin_footer.ftl"/>
    <!-- Footer content -->
</#macro>
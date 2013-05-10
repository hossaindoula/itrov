<#macro gen_app_layout title="">
	
			<!-- Header content -->
				<#include "admin_header.ftl"/>
			<!-- Header content -->
			
			<!--Body content-->
                <#nested>
			<!--Body content-->
			
			<!-- Footer content -->
				<#include "admin_footer.ftl"/>
			<!-- Footer content -->
			
			
		</body>
	</html>
</#macro>
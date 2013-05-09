
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>${PageTitle}</title>
    <link rel="stylesheet" href="${rc.getContextPath()}/resources/styles/style.default.css" type="text/css" />
    <link rel="stylesheet" href="${rc.getContextPath()}/resources/styles/style.shinyblue.css" type="text/css" />

    <script type="text/javascript" src="${rc.getContextPath()}/resources/scripts/admin/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="${rc.getContextPath()}/resources/scripts/admin/jquery-migrate-1.1.1.min.js"></script>
    <script type="text/javascript" src="${rc.getContextPath()}/resources/scripts/admin/jquery-ui-1.9.2.min.js"></script>
    <script type="text/javascript" src=${rc.getContextPath()}/resources/scripts/admin/modernizr.min.js"></script>
    <script type="text/javascript" src="${rc.getContextPath()}/resources/scripts/admin/bootstrap.min.js"></script>
    <script type="text/javascript" src="${rc.getContextPath()}/resources/scripts/admin/jquery.cookie.js"></script>
    <script type="text/javascript" src="${rc.getContextPath()}/resources/scripts/admin/custom.js"></script>
    <script type="text/javascript">
        jQuery(document).ready(function(){
            jQuery('#login').submit(function(){
                var u = jQuery('#username').val();
                var p = jQuery('#password').val();
                if(u == '' && p == '') {
                    jQuery('.login-alert').fadeIn();
                    return false;
                }
            });
        });
    </script>
</head>

<body class="loginpage">

<div class="loginpanel">
    <div class="loginpanelinner">
        <div class="logo animate0 bounceIn">ITRovers PTY LTD.</div>
        <form id="login" action="authenticate.itr" method="post">
            <div class="inputwrapper login-alert">
                <div class="alert alert-error">Invalid username or password</div>
            </div>
            <div class="inputwrapper animate1 bounceIn">
                <input type="text" name="username" id="username" placeholder="Enter any username" />
            </div>
            <div class="inputwrapper animate2 bounceIn">
                <input type="password" name="password" id="password" placeholder="Enter any password" />
            </div>
            <div class="inputwrapper animate3 bounceIn">
                <button name="submit">Sign In</button>
            </div>
            <div class="inputwrapper animate4 bounceIn">
                <label><input type="checkbox" class="remember" name="signin" /> Keep me sign in</label>
            </div>

        </form>
    </div><!--loginpanelinner-->
</div><!--loginpanel-->

<div class="loginfooter">
    <p>&copy; 2013. ITRovers PTY LTD. All Rights Reserved.</p>
</div>

</body>
</html>

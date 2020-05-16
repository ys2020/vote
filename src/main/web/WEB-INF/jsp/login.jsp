<%--
  Created by IntelliJ IDEA.
  User: 羊来
  Date: 2020/5/13
  Time: 23:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8" />
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../statics/css/nav.css"/>
    <link rel="stylesheet" type="text/css" href="../../statics/css/bootstrap.css"/>
    <script src="../../statics/js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<div class="nav-top">
    <li><a href="/userinfo">个人中心</a></li>
    <li><a href="">登录</a></li>
</div>
<div id="login">
    <div id="loginform">
        <form class="form-horizontal" role="form" action="/dologin" method="post" id="myform">
            <div class="form-group">
                <label for="firstname" class="col-sm-3 control-label">用户名：</label>
                <div class="col-sm-12">
                    <input type="text" class="form-control" id="firstname" name="uname" placeholder="请输入用户名或手机号">
                </div>
            </div>
            <div class="form-group">
                <label for="lastname" class="col-sm-3 control-label">密码：</label>
                <div class="col-sm-12">
                    <input type="password" class="form-control" id="lastname" name="password" placeholder="请输入密码">
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-3">
                    <button type="submit" class="btn btn-default">登录</button>
                </div>
                <div class="col-sm-offset-2 col-sm-3">
                    <button type="button" class="btn btn-default"  onclick="location.href='/register'">注册</button>
                </div>
            </div>

        </form>
    </div>
</div>
</body>
<script src="../../statics/js/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
    $("#tlist a").hover(function(){
        $(this).css("background-color","yellow");
    },function(){
        $(this).css("background-color","#fff");
    });
    $(function() {
        $('#myform').submit(function() {
            var $hname = $('#firstname');
            if($hname.val() == '') {
                alert('用户名不能为空！');
                $hname.focus();
                return false;
            }
            var $startTime = $('#lastname');
            if($startTime.val() == '') {
                alert('密码不能为空！');
                $startTime.focus();
                return false;
            }
            return true;
        });
    });
</script>
</html>


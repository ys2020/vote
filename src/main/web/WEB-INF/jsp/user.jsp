<%--
  Created by IntelliJ IDEA.
  User: 羊来
  Date: 2020/5/13
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../statics/css/nav.css"/>
</head>
<body>
<div class="nav-top">
    <li><a href="">首页</a></li>
    <li><a href="">功能介绍</a><li>
    <li><a href="">个人中心</a></li>
    <li><a href="">你好，aaaa</a></li>
    <li><a href="">注销</a></li>
</div>
<div id="content">
    <div id="list">
        <div id="title">
            账号管理
        </div>
        <div id="tlist">
            <li><a href="/index">个人资料</a></li>
            <li><a href="/huati">创建投票</a></li>
            <li><a href="/guanli">活动管理</a></li>
            <li><a href="/tongji">数据统计</a></li>
        </div>
    </div>
    <div id="form" style="width: 65vw">
        <div id="top">
            <a href="">个人中心</a><p style="width: 100%;"><hr ></p>
        </div>
        <div id="info">
            <p>用户昵称：<span class="font">aaaaa</span></p>
            <p>手机号码：<span class="font">11111111</span></p>
            <p>注册时间：<span class="font">2222222</span></p>
        </div>
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
</script>
</html>


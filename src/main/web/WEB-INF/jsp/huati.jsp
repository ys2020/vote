<%--
  Created by IntelliJ IDEA.
  User: 羊来
  Date: 2020/5/13
  Time: 11:35
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
    <li><a href="">登录</a></li>
    <li><a href="">注册</a></li>
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
            <li><a href="">数据统计</a></li>
        </div>
    </div>
    <div id="form">
        <div id="top">
            <a href="">创建投票</a><p style="width: 100%;"><hr ></p>
        </div>
        <div id="info">
            <form id="myform">
                <p>活动名称：<input type="text" name="hname" id="hname" value="" /><p/>
                <p>活动时间：<input type="date" name="startTime" id="startTime" value="" />-  到  -<input type="date" name="endTime" id="endTime" value="" /><p/>
                <p><span id="textfont" style="color: #000000;">活动内容：</span><textarea id="text" name="text"></textarea></p>
                <p><input type="submit" name="" id="" value="保存并下一步" style="color: #FFFFFF;background: #007AFF;" /></p>
            </form>
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
    $(function() {
        $('#myform').submit(function() {
            var $hname = $('#hname');
            if($hname.val() == '') {
                alert('活动名称不能为空！');
                $hname.focus();
                return false;
            }
            var $startTime = $('#startTime');
            if($startTime.val() == '') {
                alert('开始日期不能为空！');
                $startTime.focus();
                return false;
            }
            var $endTime = $('#endTime');
            if($endTime.val() == '') {
                alert('截至日期不能为空！');
                $endTime.focus();
                return false;
            }
            var $textfont = $('#textfont');
            if($textfont.val() == '') {
                alert('活动介绍不能为空！');
                $textfont.focus();
                return false;
            }

            var startTime=$("#startTime").val();
            var start=new Date(startTime);
            var endTime=$("#endTime").val();
            var end=new Date(endTime);
            if(end<start){
                alert('截至时间不得早于开始时间！');
                return false;
            }
            return true;
        });
    });
</script>
</html>

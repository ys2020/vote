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
    <link rel="stylesheet" type="text/css" href="../../statics/css/bootstrap.css"/>
    <script src="../../statics/js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<div class="nav-top">
    <li><a href="/index">首页</a></li>
    <li><a href="">功能介绍</a><li>
    <li><a href="/userinfo">个人中心</a></li>
    <li><a href="">你好，${userSession.uname}</a></li>
    <li><a href="/logout">注销</a></li>
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
        <button type="button" onclick="add()" value="添加新选项" class="btn btn-primary" style="margin-bottom: 5px;">添加新选项</button>
        <form action="/addxuan" method="post">
            <div id="info" style="width: 65vw">
                <div class="xuanxiang" id="xuanxiang1">
                    <div class="bianhao">
                        <input type="hidden" name="xuans[0].hid" value="${huati.hid}">
                        编号:1  <input type="hidden" name="xuans[0].xid"  placeholder="请输入编号"  value="1"><br/>
                        选项名称:<input type="text" name="xuans[0].xname"  placeholder="请输入名称" rel="519050" value=""><br/>
                        选项描述:<input type="text" name="xuans[0].xcontent"  placeholder="请输入描述" rel="519050" value="">
                    </div>
                    <div class="addbtn">
                        <button class="btn btn-primary" rel="519050" Describe="">修改描述</button>
                        <button class="btn btn-primary" onclick="Del(1)">删除选项</button>
                    </div>
                </div>

                <div class="xuanxiang" id="xuanxiang2">
                    <div class="bianhao">
                        <input type="hidden" name="xuans[1].hid" value="${huati.hid}">
                        编号:2  <input type="hidden" name="xuans[1].xid"  placeholder="请输入编号"  value="2"><br/>
                        选项名称:<input type="text" name="xuans[1].xname"  placeholder="请输入名称" rel="519050" value=""><br/>
                        选项描述:<input type="text" name="xuans[1].xcontent"  placeholder="请输入描述" rel="519050" value="">
                    </div>
                    <div class="addbtn">
                        <button class="btn btn-primary" name=""   rel="519050" Describe="">修改描述</button>
                        <button class="btn btn-primary" name=""   onclick="Del(2)">删除选项</button>
                    </div>
                </div>
            </div>
            <button class="submit" name=""  id="" style="color: #FFFFFF;background: #007AFF;width: 70%;height: 7%;">保存并发布</button>
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
    //添加新事项
    var i=3;
    function add(){
        var info=document.getElementById("info");
        var input=document.createElement("input");
        var div=document.createElement("div");
        div.innerHTML=
            '<div class="bianhao">'+
            '<input type="hidden" name="xuans['+(i-1)+'].hid" value="${huati.hid}">'+
            '编号:'+i+' <input type="hidden" name="xuans['+(i-1)+'].xid" class="bh-input nickname" placeholder="请输入编号"  value="'+i+'"><br/>'+
            '选项名称:<input type="text" name="xuans['+(i-1)+'].xname"  placeholder="请输入名称"  value=""><br/>'+
            '选项描述:<input type="text" name="xuans['+(i-1)+'].xcontent"  placeholder="请输入描述"  value="">'+
            '</div>'+
            '<div class="addbtn">'+
            '<button class="btn btn-primary"  Describe="">修改描述</button>'+
            '<button class="btn btn-primary"  onclick="Del('+i+')">删除选项</button>'+
            '</div>';
        div.id="xuanxiang"+i;
        div.className="xuanxiang";
        i=i+1;
        info.appendChild(div);
    }
    //删除选项
    function Del(i){
        var msg='是否删除选项？';
        if (confirm(msg)) {
            var info=document.getElementById("info");
            var xid =document.getElementById("xuanxiang"+i);
            info.removeChild(xid);
        }
    }
</script>
</html>


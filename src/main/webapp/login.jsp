<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<title>-登录</title>
<div class="content">
		<form class="login-form" id="loginForm">
			<div class="form-group">
				<table>
					<tr>
						<td><h3 class="form-title" style="margin-left: 10px;">登录</h3></td>
					</tr>
				</table>
			</div>
			<form id="edit-form" method="post" enctype="multipart/form-data"
				action="">
				<div class="alert alert-danger display-hide">
					<button class="close" data-close="alert"></button>
					<span>请输入用户名和密码. ${update}</span>
				</div>
				<div class="form-group">
					<label class="control-label visible-ie8 visible-ie9">用户名</label>
					<div class="input-icon">
						<i class="fa fa-user"></i> <input class="form-control placeholder-no-fix" type="text" autocomplete="off" placeholder="用户名" name="userAccount" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label visible-ie8 visible-ie9">密码</label>
					<div class="input-icon">
						<i class="fa fa-lock"></i> <input class="form-control placeholder-no-fix" type="password" autocomplete="off" placeholder="密码" name="password" />
					</div>
				</div>
				<div class="form-actions">
					<label class="checkbox"> </label> <a id="btnLogin" class="btn pull-right"> 登录 <i class="m-icon-swapright m-icon-white"></i>
					</a>
				</div>
			</form>
		</form>
	</div>
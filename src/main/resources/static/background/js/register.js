
layui.define([ 'layer', 'form'], function (exports) {
    var form = layui.form();
    var $ = layui.jquery;
    //自定义验证
    form.verify({
        passWord: [/^[\S]{6,12}$/, '密码必须6到12位'],
        account: function (value) {
            if (value.length <= 0 || value.length > 10) {
                return "账号必须1到10位"
            }
            var reg = /^[a-zA-Z0-9]*$/;
            if (!reg.test(value)) {
                return "账号只能为英文或数字";
            }
        },
    });
    //监听注册提交
    form.on('submit(register)', function (data) {
        var register = layer.load(1);

            layer.close(register);

            var ip=returnCitySN["cip"];
            var ipName=returnCitySN["cname"];
            var loginTime=new Date();

            $.ajax({
                url:"/register",
                type:"GET",
                data:{
                    username:data.field.account,
                    password:data.field.password,

                },
                success:function (result) {
                    var result=eval("("+result+")");
                    if(result.success){
                        layer.msg('注册成功，正在跳转......', { icon: 6 });
                        layer.closeAll('page');
                        setTimeout(function () {
                            location.href = "/background/index";
                        }, 1000);
                    }else{
                        layer.msg('账户名已存在', { icon: 5 });
                    }
                }
            });
        return false;
    });
    //检测键盘按下
    $('body').keydown(function (e) {
        if (e.keyCode == 13) {  //Enter键
            if ($('#layer-register').length <= 0) {
               register();
            }
        }
    });

    $('.enter').on('click', register);

    function register() {
        var registerHtml = '';
        registerHtml += '<form class="layui-form" action="">';
        registerHtml += '<div class="layui-form-item">';
        registerHtml += '<label class="layui-form-label">账号</label>';
        registerHtml += '<div class="layui-input-inline pm-login-input">';
        registerHtml += '<input type="text" name="account" lay-verify="account" placeholder="请输入账号"  autocomplete="off" class="layui-input">';
        registerHtml += '</div>';
        registerHtml += '</div>';
        registerHtml += '<div class="layui-form-item">';
        registerHtml += '<label class="layui-form-label">密码</label>';
        registerHtml += '<div class="layui-input-inline pm-login-input">';
        registerHtml += '<input type="password" name="password" lay-verify="passWord" placeholder="请输入密码"  autocomplete="off" class="layui-input">';
        registerHtml += '</div>';
        registerHtml += '</div>';
        registerHtml += '<div class="layui-form-item">';
        registerHtml += '<label class="layui-form-label">人机验证</label>';
        registerHtml += '<div class="layui-input-inline pm-login-input">';
        registerHtml += '<div class="l-captcha" lay-verify="result_response" data-site-key="0c5f2ddcf3eb0f58a678e0c50e0d736e"></div>';
        registerHtml += '</div>';
        registerHtml += '</div>';
        registerHtml += '<div class="layui-form-item" style="margin-top:25px;margin-bottom:0;">';
        registerHtml += '<div class="layui-input-block">';
        registerHtml += ' <button class="layui-btn" style="width:230px;" lay-submit="" lay-filter="register">注册</button>';
        registerHtml += ' </div>';
        registerHtml += ' </div>';
        registerHtml += '</form>';
        registerHtml +='<script src="//captcha.luosimao.com/static/dist/api.js"></script>';

        layer.open({
            id: 'layer-register',
            type: 1,
            title: false,
            shade: 0.4,
            shadeClose: true,
            area: ['480px', '270px'],
            closeBtn: 0,
            anim: 1,
            skin: 'pm-layer-login',
            content: registerHtml
        });
        layui.form().render('checkbox');
    }

    exports('register', {});
});


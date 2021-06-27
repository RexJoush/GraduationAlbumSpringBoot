import {wx_url} from "./url.js";

axios.get(`${wx_url}/getWxData`).then(val => {
    if (val.data.code == 1200) {
        let {
            appId,
            timestamp,
            signature,
            nonceStr
        } = val.data.data
        console.log(timestamp);
        console.log(nonceStr);
        console.log(signature);
        let link = `${url}8080/index.html`;
        wx.config({
            debug: false, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
            appId, // 必填，公众号的唯一标识
            timestamp, // 必填，生成签名的时间戳
            nonceStr, // 必填，生成签名的随机串
            signature, // 必填，签名
            jsApiList: ['updateAppMessageShareData', 'onMenuShareAppMessage', 'updateTimelineShareData', 'onMenuShareTimeline'] // 必填，需要使用的JS接口列表
        });
        wx.ready(function () { //需在用户可能点击分享按钮前就先调用
            let title = "长书寄华年 短歌会明朝";
            let desc = "2021届毕业生，快来签收你的专属盒子～";
            let url = 'https://www.rexjoush.com/img/1.jpg';
            wx.onMenuShareAppMessage({
                title, // 分享标题
                desc, // 分享描述
                link, // 分享链接，该链接域名或路径必须与当前页面对应的公众号JS安全域名一致
                imgUrl: url, // 分享图标
                success: function () {
                    // 设置成功
                }
            })
            wx.onMenuShareTimeline({
                title, // 分享标题
                link, // 分享链接，该链接域名或路径必须与当前页面对应的公众号JS安全域名一致
                imgUrl: url, // 分享图标
                success: function () {
                    // 设置成功
                }
            })
            // wx.onMenuShareWeibo({
            //     title, // 分享标题
            //     desc, // 分享描述
            //     link, // 分享链接
            //     imgUrl: url, // 分享图标
            //     success: function () {
            //         // 用户确认分享后执行的回调函数
            //     },
            //     cancel: function () {
            //         // 用户取消分享后执行的回调函数
            //     }
            // });
        });
    }

})
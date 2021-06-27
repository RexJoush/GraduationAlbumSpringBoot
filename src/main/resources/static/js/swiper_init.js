var mySwiper = new Swiper('.swiper-container', {
    direction: 'vertical', // 垂直切换选项
    // loop: true, // 循环模式选项
    on: {
        // 滑动时触发事件
        slideChangeTransitionStart: function () {
            // this.activeIndex为当前页面
            // alert(this.activeIndex);
            switch (this.activeIndex) {
                case 0:
                    // $(".user_box").html(`<img src="./图片素材/user_1.png" alt="">`);
                    $(".barrage_box").html(`<img src="./图片素材/弹幕_1.png" alt=""><img style="opacity: 0;" id="unsend" src="./图片素材/禁止弹幕_1.png" alt="">`);
                    $(".music_box").html(`<img src="./图片素材/Music disc_1.png" alt="">`);
                    $(".outer2 .contain").removeClass("animation bounce-in-up");
                    break;
                case 1:
                    // $(".user_box").html(`<img src="./图片素材/user.png" alt="">`);
                    $(".barrage_box").html(`<img src="./图片素材/弹幕.png" alt=""><img style="opacity: 0;" id="unsend" src="./图片素材/禁止弹幕.png" alt="">`);
                    $(".music_box").html(`<img src="./图片素材/Music disc.png" alt="">`);
                    $(".outer2 .contain").addClass("animation bounce-in-up");
                    $(".outer3 .contain").removeClass("animation clip-x-in");
                    break;
                case 2:
                    $(".outer2 .contain").removeClass("animation bounce-in-up");
                    $(".outer3 .contain").addClass("animation clip-x-in");
                    $(".outer4 .contain").removeClass("animation fade-in-up");
                    break;
                case 3:
                    $(".outer3 .contain").removeClass("animation clip-x-in");
                    $(".outer4 .contain").addClass("animation fade-in-up");
                    $(".outer5 .contain").removeClass("animation fade-in-left");
                    break;
                case 4:
                    $(".outer4 .contain").removeClass("animation fade-in-up");
                    $(".outer5 .contain").addClass("animation fade-in-left");
                    $(".outer6 .contain").removeClass("animation roll-in-right");
                    break;
                case 5:
                    $(".outer5 .contain").removeClass("animation fade-in-left");
                    $(".outer6 .contain").addClass("animation roll-in-right");
                    $(".outer7 .contain").removeClass("animation rotbo-in-left");
                    break;
                case 6:
                    $(".outer6 .contain").removeClass("animation roll-in-right");
                    $(".outer7 .contain").addClass("animation rotbo-in-left");
                    $(".outer8 .contain").removeClass("animation bounce-in-left");
                    break;
                case 7:
                    $(".outer7 .contain").removeClass("animation rotbo-in-left");
                    $(".outer8 .contain").addClass("animation bounce-in-left");
                    $(".outer9 .contain").removeClass("animation back-in-right");
                    break;
                case 8:
                    $(".outer8 .contain").removeClass("animation bounce-in-left");
                    $(".outer9 .contain").addClass("animation back-in-right");
                    $(".outer10 .contain").removeClass("animation roll-in-right");
                    break;
                case 9:
                    $(".outer9 .contain").removeClass("animation back-in-right");
                    $(".outer10 .contain").addClass("animation roll-in-right");
                    $(".outer11 .contain").removeClass("animation back-in-up");
                    break;
                case 10:
                    $(".outer10 .contain").removeClass("animation roll-in-right");
                    $(".outer11 .contain").addClass("animation back-in-up");
                    // $(".outer12 .contain").removeClass("animation back-in-down");
                    break;
                case 11:
                    $(".outer11 .contain").removeClass("animation back-in-up");
                    // $(".outer12 .contain").addClass("animation back-in-down");
                    $(".outer13 .contain").removeClass("animation fade-in-left");
                    break;
                case 12:
                    // $(".user_box").html(`<img src="./图片素材/user.png" alt="">`);
                    $(".barrage_box").html(`<img src="./图片素材/弹幕.png" alt=""><img style="opacity: 0;" id="unsend" src="./图片素材/禁止弹幕.png" alt="">`);
                    $(".music_box").html(`<img src="./图片素材/Music disc.png" alt="">`);
                    $(".outer13 .contain").addClass("animation fade-in-left");
                    break;
                case 13:
                    $(".outer13 .contain").removeClass("animation fade-in-left");
                    // $(".user_box").html(`<img src="./图片素材/user_1.png" alt="">`);
                    $(".barrage_box").html(`<img src="./图片素材/弹幕_1.png" alt=""><img style="opacity: 0;" id="unsend" src="./图片素材/禁止弹幕_1.png" alt="">`);
                    $(".music_box").html(`<img src="./图片素材/Music disc_1.png" alt="">`);
                    $(".ending").addClass("move");
                    break;
            }
        },
    },
})

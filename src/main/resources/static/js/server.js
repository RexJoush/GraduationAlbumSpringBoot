// 调入数据接口
let data = axios.get("http://bys.nwu.edu.cn:8080/student/getStudentInfo")



// 调入弹幕接口
axios.get("http://bys.nwu.edu.cn:8080/bullet/addBullet", {
    params:{
        content:$("#text").val(),
    },
    head:{},
});


// 暴露promise对象
export default data;
import {base_url} from "./url.js"

// 调入数据接口
let data = axios.get(`${base_url}/student/getStudentInfo`)



// 暴露promise对象
export default data;
import axios from "../axios";
import qs from 'qs';

class DriverService {
    postDriver = async (data) => {
        const promise = new Promise((resolve, reject) => {
            axios.post('driver', qs.stringify(data))
                .then((res) => {
                    return resolve(res)
                }).catch((err) => {
                return resolve(err)
            })
        });
        return await promise;
    }

    fetchDrivers = async (data) => {
        const promise = new Promise((resolve, reject) => {
            axios.get('driver')
                .then((res) => {
                    return resolve(res)
                }).catch((err) => {
                return resolve(err)
            })
        });
        return await promise;
    }

    deleteDriver = async (params) => {
        console.warn("hellow de")
        const promise = new Promise((resolve, reject) => {
            axios.delete('driver', {params:params})
                .then((res) => {
                    return resolve(res)
                }).catch((err) => {
                return resolve(err)
            })
        });
        return await promise;
    }

    updateDriver = async (data) =>{
        const promise = new Promise((resolve, reject) => {
            axios.put('driver',data)
                .then((res)=>{
                    return resolve(res)
                }).catch((err)=>{
                    return resolve(err)
            })
        });
        return await promise;
    }
}

export default new DriverService();
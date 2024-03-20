import axios from 'axios';

export default axios.create({
    baseURL: 'https://206d-105-48-54-251.ngrok-free.app/', // base address of API endpoint that our client calls -> http req will not be blocked by CORS
    headers: {
        "ngrok-skip-browser-warning": "true",
        "Access-Control-Allow-Origin": "true"
    } // ngrok exposes API endpoints
});


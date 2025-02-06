// 必要なモジュールをインポートします
const express = require('express');
const app = express();

// ルートURLに対するGETリクエストを処理します
app.get('/', (req, res) => {
    res.send('Hello World!');
});

// 3000番ポートでサーバーを起動します
app.listen(3000, () => {
    console.log('App is running on http://localhost:3000');
});

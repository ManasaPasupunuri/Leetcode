function sleep(millis) {
  return new Promise(resolve => setTimeout(() => resolve(millis), millis));
}

let t = Date.now();
sleep(100).then(v => {
  console.log(Date.now() - t);
  console.log(v);              
});

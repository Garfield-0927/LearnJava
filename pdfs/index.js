const path = require("path");
const fs = require("fs");
const merge = require("easy-pdf-merge");
const resolve = path.resolve;

const pdf1 = [];
const pdf2 = [];

fs.readdirSync(__dirname + "/pdf1").forEach((file) => {
	pdf1.push(file);
});
fs.readdirSync(__dirname + "/pdf2").forEach((file) => {
	pdf2.push(file);
});
pdf1.sort((pre, cur) => {
	return parseInt(pre.slice(2)) - parseInt(cur.slice(2));
});
pdf2.sort((pre, cur) => {
	return parseInt(pre.slice(2)) - parseInt(cur.slice(2));
});
const pdf1_copy = pdf1.map((item) => {
  item = __dirname + "/pdf1/" + item;
	return item
});
const pdf2_copy = pdf2.map((item) => {
  item = __dirname + "/pdf2/" + item;
	return item
});
console.log(pdf1_copy);
console.log(pdf2_copy);
fs.writeFileSync(__dirname + "/p1.pdf", "", "utf8", (err) => console.log(err));
fs.writeFileSync(__dirname + "/p2.pdf", "", "utf8", (err) => console.log(err));

merge(pdf1_copy, __dirname + "/p1.pdf", (err) => {
	if (err) {
		return console.log(err);
	}
	console.log("success");
});

merge(pdf2_copy, __dirname + "/p2.pdf", (err) => {
	if (err) {
		return console.log(err);
	}
	console.log("success");
});

function permute(str, answer) {
    if (str.length == 0) {
        console.log(answer + " ");
        return;
    }
    for(let i = 0 ;i < str.length; i++) {
		let ch = str.charAt(i);
		let left_substr = str.substring(0, i);
		let right_substr = str.substring(i + 1);
		let rest = left_substr + right_substr;
		permute(rest, answer + ch);
	}
}

permute("example", "");
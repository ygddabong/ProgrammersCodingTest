# Programmers Coding Test

My Java solutions to [Programmers](https://school.programmers.co.kr/learn/challenges) coding-test practice problems (Korean), written in 2020.

| Category | Problem | Approach | Time |
| --- | --- | --- | --- |
| Sorting | [K번째수 (K-th Number)](src/Array/Array_1/Solution.java) | Copy each sub-range, sort, pick the k-th | O(c · n log n) |
| Hash | [완주하지 못한 선수 (Unfinished Runner)](src/Hash/Hash_1/Solution.java) | Sort both lists and find the first mismatch | O(n log n) |
| Hash | [전화번호 목록 (Phone Book)](src/Hash/Hash_2/Solution.java) | Sort; a prefix always sorts right before a number it prefixes, so only neighbours are compared | O(n log n) |
| Hash | [위장 (Camouflage)](src/Hash/Hash_3/Solution.java) | Count items per type; product of (count + 1), minus 1 | O(n) |

## Running the examples

[`test/Examples.java`](test/Examples.java) runs every solution against the examples from the problem statements. Requires JDK 17+.

```bash
javac -d out $(find src test -name '*.java')
java -cp out Examples
```

## 2026 update

- Added the example runner and this README, with a link to each problem
- Phone Book: replaced the O(n²) pairwise comparison with a sort-and-compare-neighbours O(n log n) solution
- Removed empty `main` methods, a leftover debug `println`, and a nested class in K번째수
- Removed compiled `.class` files and Eclipse project files; added `.gitignore`

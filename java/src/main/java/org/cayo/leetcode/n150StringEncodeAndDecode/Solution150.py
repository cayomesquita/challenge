from typing import List


class Solution:

    def encode(self, strs: List[str]) -> str:
        encoded = ''
        for word in strs:
            encoded += str(len(word)) + "#" + word
        return encoded

    def decode(self, s: str) -> List[str]:
        decoded = []
        aux = ""
        i = 0
        while i < len(s):
            c = s[i]
            if c == "#":
                length = int(aux)
                end = i + length + 1
                word = s[i+1:end]
                decoded.append(word)
                aux = ""
                i = end
            else:
                aux += c
                i += 1
        return decoded

print(Solution().encode(["neet","code","love","you"]))
print(Solution().decode(Solution().encode(["neet","code","love","you"])))
print(Solution().encode(["we","say",":","yes"]))
print(Solution().decode(Solution().encode(["we","say",":","yes"])))

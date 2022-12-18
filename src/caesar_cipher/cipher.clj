(ns caesar-cipher.cipher
  (:require [clojure.string :as s]))

(defn shift-num
  "Returns num if num is NOT in between 65-90 (ascii value for A-Z)
  else returns the shifted (n steps) number for provided num
  Examples: (shift-num 3 65) ;;=> 68
            (shift-num 3 90) ;;=> 67
            (shift-num 3 60) ;;=> 60"
  [n num]
  (if (< 64 num 91)
    (+ 65 (mod (- (+ n num) 65) 26))
    (identity num)))

(defn cipher
  "Decode/Encode provided text using caesar-cipher encryption algorithm
  https://en.wikipedia.org/wiki/Caesar_cipher
  Usage: (cipher key text decode?)
  Examples: (cipher 23 \"abc\" true) ;;=> \"XYZ\"
            (cipher 23 \"xyz\" false) ;;=> \"ABC\"
  "
  [key text decode?]
  (let [text (s/upper-case text)]
    (apply str
           (map #(char (shift-num (if decode? key (- 0 key)) (int %1)))
                (char-array text)))))


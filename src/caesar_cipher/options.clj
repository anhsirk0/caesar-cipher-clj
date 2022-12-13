(ns caesar-cipher.options)

(def cli-options
  ;; An option with a required argument
  [["-k" "--key KEY" "Key to shift the alphabets"
    :default 13
    :parse-fn #(Integer/parseInt %)
    :validate [#(< -26 % 26) "Must be a number between -26 and 26"]]
   ["-d" "--decode TEXT" "Text to decode."
    :validate [#(< 0 (count %)) "Text must not be empty"]]
   ["-e" "--encode TEXT" "Text to encode."
    :validate [#(< 0 (count %)) "Text must not be empty"]]
   ["-h" "--help"]])


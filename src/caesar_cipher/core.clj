(ns caesar-cipher.core
  (:require [caesar-cipher.cipher :refer [cipher]])
  (:require [caesar-cipher.options :refer [cli-options]])
  (:require [clojure.tools.cli :refer [parse-opts]])
  (:gen-class))

(defn -main
  "Parse arguments and run `cipher` fn"
  [& args]
  (let [arguments (parse-opts args cli-options)
        options (:options arguments)
        summary (:summary arguments)]
    (if (:help options)
      (println summary)
      (let [key (:key options)
            encode (:encode options)
            decode (:decode options)]
        (println (cipher key (or encode decode) (nil? decode)))))))

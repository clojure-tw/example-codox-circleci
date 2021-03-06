(defproject example-lib "0.1.0-SNAPSHOT"
  :description " An example to ues codox and circleci to generate document."
  :url "https://github.com/clojure-tw/example-codox-circleci"
  :license {:name "MIT License"
            :url "https://github.com/clojure-tw/example-codox-circleci/LICENSE"}

  :dependencies [[org.clojure/clojure "1.8.0"]]

  :plugins [[lein-codox "0.9.4"]]

  :codox {:source-uri "https://github.com/clojure-tw/example-codox-circleci/blob/master/{filepath}#L{line}"})

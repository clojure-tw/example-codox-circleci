(ns example-lib.core-test
  (:require [clojure.test :refer :all]
            [example-lib.core :refer :all]))

(deftest a-test
  (testing "Hello, World!"
    (is (= (hello) "Hello, World!"))))

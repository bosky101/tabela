(ns ^{:doc "Tests for Tabela tasks that reads from db"
      :author "Bosky <bosky101@gmail.com>"}
  tabela.db.core-test
  (:require [tabela.db.core :as db]
            [clj-time.core :as ct]
            [clojure.test :refer :all]))

^{:refer tabela.db.core/read-jobs :added "0.1"}
(deftest db-test
  "read-jobs must not crash"
  (let [db-result (db/read-jobs (ct/now)
                                {:param "foo"})]
    (is (nil? db-result)
        "the read-jobs does nothing")))

(comment )

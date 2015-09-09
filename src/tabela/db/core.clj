(ns ^{:doc "Tabela tasks that reads from db"
      :author "Bosky <bosky101@gmail.com>"}
  tabela.db.core)

(defn read-jobs
  "One equals one asdasd adasd
   a asdasd asd a
   asdasd asd asd ad
   1
   => 1

   (+ 1 1)
   => 2

   (let [db-result (db/read-jobs)]
     (is (nil? db-result)
         \"the read-jobs does nothing\"))"
  {:added "0.1.0"}
  [t opts]
  (println (:param opts) ": " t))

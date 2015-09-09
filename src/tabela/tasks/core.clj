(ns ^{:doc "Tabela tasks helper"
      :author "Bosky <bosky101@gmail.com>"}
  tabela.tasks.core
  (:require [tabela.tasks.root :as ttr]))

(defn read-tasks
  []
  {:added "0.1.0"}
  [{:id "root-task"
    :handler ttr/read-jobs
    :schedule "/5 * * * * * *"
    :opts {:output "Hello There"}}])

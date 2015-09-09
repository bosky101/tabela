(ns ^{:doc "Tabela, a scheduled model dispatcher"
      :author "Bosky <bosky101@gmail.com>"}
  tabela.core
  (:require [cronj.core :as cc]
            [tabela.tasks.core :as ttc]))

(defonce root-task nil)

(defn start
  "start the root task. loops every 5 minutes. calls read-jobs."
  {:added "0.1.0"}
  []
  (alter-var-root #'root-task
                  (constantly (cc/cronj :entries (ttc/read-tasks))))
  (cc/start! root-task))


(defn stop
  "stop the root task"
  {:added "0.1.0"}
  []
  (when root-task
    (cc/stop! root-task)
    (alter-var-root #'root-task
                    (constantly nil))))


(defn restart
  "restart the root task"
  []
  (stop)
  (start))

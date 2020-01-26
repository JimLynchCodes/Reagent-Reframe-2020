(ns reframe-2020.events
  (:require
   [re-frame.core :as re-frame]
   [reframe-2020.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))

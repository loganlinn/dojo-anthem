(ns dojo-anthem.group5.core
  "Group 5's crack at programming/hacking a national anthem.
  Naturally, we chose the Star Spangled Banner.
  We experimented a lot, but ended up just piggybacking off
  of functions defined in an Overtone example ns"
  (:require [overtone.examples.notation.mad :refer :all]))


(def ssb [[[F4 D4] 1]
          [[A#3 D4 F4] 3]
          [[A#4] 2]
          [[D5 C5] 1]
          [[A#4 D4 E4] 3]
          [[F4] 2]
          [[F4 F4] 1]
          [[D5 C5 A#4] 3]
          [[A4] 2]
          [[G3 A4] 1]
          [[A#4 A#4 F4] 3]
          [[D4 A#3] 2]
          [[F4 D4] 1]
          [[A#3 D4 F4] 3]
          [[A#4] 2]
          [[D5 C5] 1]
          [[A#4 D4 E4] 3]
          [[F4] 2]
          [[F4 F4] 1]
          [[D5 C5 A#4] 3]
          [[A4] 2]
          [[G4 A4] 1]
          [[A#4 A#4 F4] 3]
          [[D4 A#3] 2]
          ;; ...
          ])

(defn play-ssb
  []
  (p (mapcat (fn [[notes duration]] (pattern notes (/ duration 2))) ssb)))

(defn -main
  [& args]
  (play-ssb))

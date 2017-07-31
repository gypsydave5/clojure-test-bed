FROM clojure
EXPOSE 3000
COPY . /usr/src/app
WORKDIR /usr/src/app
RUN lein deps
CMD ["lein", "ring", "server-headless"]
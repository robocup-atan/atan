#!/bin/bash

if [ "$TRAVIS_REPO_SLUG" == "robocup-atan/atan" ] && [ "$TRAVIS_PULL_REQUEST" == "false" ] && [ "$TRAVIS_BRANCH" == "master" ]; then

  echo "Publishing javadoc..."

  cp -R $HOME/build/robocup-atan/atan/target/apidocs $HOME/javadoc-latest

  cd $HOME
  git config --global user.email "travis@travis-ci.org"
  git config --global user.name "travis-ci"
  git clone --quiet --branch=gh-pages https://${GH_TOKEN}@github.com/robocup-atan/atan gh-pages > /dev/null

  cd gh-pages
  git rm -rf ./javadoc
  cp -Rf $HOME/javadoc-latest ./javadoc
  git add -f .
  git commit -m "Updating JavaDoc after successful Travis build $TRAVIS_BUILD_NUMBER."
  git push -fq origin gh-pages > /dev/null

  echo "Published Javadoc to gh-pages."
  
fi


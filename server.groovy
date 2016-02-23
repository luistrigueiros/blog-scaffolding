@Grab('io.ratpack:ratpack-groovy:1.2.0')
import static ratpack.groovy.Groovy.ratpack

ratpack {
  handlers {
    files { f -> f.dir('build/jbake').indexFiles('index.html') }
  }
}

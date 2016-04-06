import javax.inject.{ Inject, Singleton }

import com.google.inject.AbstractModule
import org.aspectj.weaver.loadtime.ClassLoaderWeavingAdaptor
import play.api.Environment
import play.api.inject.ApplicationLifecycle

class InitModule extends AbstractModule {
  override def configure(): Unit = {
    bind(classOf[ApplicationLifecycleHandler]).asEagerSingleton()
  }
}

@Singleton
class ApplicationLifecycleHandler @Inject() (
    env: Environment,
    lifecycle: ApplicationLifecycle
) {
  new ClassLoaderWeavingAdaptor
}

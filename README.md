for Dagger Dependency here mentioned is exactly for its Component.

it means A Component can depend on B Component. why? because A Component
needs the injectable Objects in B Component. here in the example, DependencyTestComponent
needs the App provided by AppComponent.

some notes for using Dagger Component dependency:
1. two Components' Scope should not be the same
2. depending Component's Scope must be shorter than depended Component.
   (here Scope means life-circle. In this example DependencyTestComponent use @PerDependency while AppComponent user @Singleton)
3. depended Component should provide an interface for depending Component to get the Objects they need
   (In the example, AppComponent provided method "getApp()" for DependencyComponent to get App's Object)



for Dagger Singleton and Scope, first thing you need to be clear is that
1. Dagger's Singleton is not Java's Singleton
2. Dagger's Scope is just as its qualifier
3. Component controls the Objects' life-circle
4. a pair of Component and Module should have them same scope

so if you want to make some objects have only one instance through out your app,
you need to make only one Component's instance through out your app.
that means you need to make the Components' instance in your App. and expose it
to outside to user this singleton instance.

for Dagger Provide, the only thing you need to know is when we need to provide.

Firstly, i will give some explaintation for how Dagger gets the Objects injected.
Let me give an example:
Boss for ProvideTestActivity in our example
Meal for App
Assistant for ProvideTestComponent
Cook hired by Boss to make meal for him here for ProvideTestModule
TakeOut for Inject Constructor as InjectBean's constructor

now boss wants some meal for launch. Assistant contact Cook if Cook is available then Cook will
make the meal and provide it to Assistant and Assistant will provide for boss. while if Cook is
not available then Assistant will contact TakeOut to delivery the meal.

that how Dagger provide the objects needs to be injected.

so the key points is as following:
1. two way to get injectable objects: Module's Provide and Inject Constructor
2. the Priority of Module's provide is higher than Inject Constructor's

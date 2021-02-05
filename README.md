# Template context contributor

https://help.liferay.com/hc/en-us/articles/360018170931-Template-Context-Contributor

https://help.liferay.com/hc/en-us/articles/360018162111-Context-Contributors

Working with Template-Context-Contributos as example for using services in freemaker templates.
Creating Helper class to pass to freemakers templates

```java
@Component(
    immediate = true,
    property = {"type=" + TemplateContextContributor.[Type of Contributor]},
    service = TemplateContextContributor.class
)
```
Type of Contributor => Type in Template Context Contributor should be set to TYPE_GLOBAL 


# Files

In master branch

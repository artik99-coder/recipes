//package security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // Отключение авторизации
//        http
//                .authorizeRequests()
//                .antMatchers("/**").permitAll()  // Разрешаем доступ ко всем эндпоинтам
//                .and()
//                .csrf().disable();  // Отключаем защиту от CSRF (если нужно)
//    }
//}

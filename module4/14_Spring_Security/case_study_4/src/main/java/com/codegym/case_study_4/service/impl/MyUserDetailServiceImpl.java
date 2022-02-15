//    package com.codegym.case_study_4.service.impl;
//
//    import com.codegym.case_study_4.model.MyUserDetail;
//    import com.codegym.case_study_4.model.User;
//    import com.codegym.case_study_4.repository.UserRepository;
//    import org.springframework.beans.factory.annotation.Autowired;
//    import org.springframework.security.core.userdetails.UserDetails;
//    import org.springframework.security.core.userdetails.UserDetailsService;
//    import org.springframework.security.core.userdetails.UsernameNotFoundException;
//    import org.springframework.stereotype.Service;
//
//    @Service
//    public class MyUserDetailServiceImpl implements UserDetailsService {
//        @Autowired
//        private UserRepository userRepository;
//
//        @Override
//        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//            User user = userRepository.findByUsername(username);
//            if (user == null) {
//                throw new UsernameNotFoundException("Không tìm thấy " + username);
//            }
//            return new MyUserDetail(user);
//        }
//    }

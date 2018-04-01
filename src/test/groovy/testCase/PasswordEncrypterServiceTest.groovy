package testCase

import Source.PasswordEncrypterService
import Source.User
import spock.lang.Specification

class PasswordEncrypterServiceTest extends Specification {

    def "to test whether the password is propely encrypted"()
    {
           String password = "payal"

          when:

          PasswordEncrypterService passwordEncrypterService = new PasswordEncrypterService()
          String encryptedPassword1 = passwordEncrypterService.encrypt(password)

          then:
          def decoded = new String(encryptedPassword1.decodeBase64())
          password==decoded
         
    }
    }


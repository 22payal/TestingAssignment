package testCase

import Source.PasswordEncrypterService
import spock.lang.Specification

class PasswordEncrypterServiceTest extends Specification {

    def "to test whether the password is propely encrypted"()
    {
            PasswordEncrypterService passwordEncrypterService = new PasswordEncrypterService()

           String pwd1 = "payal"

          when:

          String encryptedPassword1 = passwordEncrypterService.encrypt(pwd1)

          then:
          encryptedPassword1.size()==8

    }
    }
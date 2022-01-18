/*
 * Hydrogen Admin API
 * The Hydrogen Admin API
 *
 * OpenAPI spec version: 1.0.2
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.17
 *
 * Do not edit the class manually.
 *
 */


(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.HydrogenAdminApi);
  }
}(this, function(expect, HydrogenAdminApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new HydrogenAdminApi.ClientApi();
  });

  describe('(package)', function() {
    describe('ClientApi', function() {
      describe('createUsingPOST', function() {
        it('should call createUsingPOST successfully', function(done) {
          // TODO: uncomment, update parameter values for createUsingPOST call and complete the assertions
          /*
          var client = new HydrogenAdminApi.Client();
          client.authorities = "";
          client.id = "0";
          client.isAccountNonExpired = false;
          client.isAccountNonLocked = false;
          client.isCredentialsNonExpired = false;
          client.isEnabled = false;
          client.password = "";
          client.tenant = "";
          client.updateDate = new Date();
          client.username = "";

          instance.createUsingPOST(client, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(HydrogenAdminApi.Client);
            expect(data.authorities).to.be.a('string');
            expect(data.authorities).to.be("");
            expect(data.createDate).to.be.a(Date);
            expect(data.createDate).to.be(2018-06-28T18:17:23.579+0000);
            expect(data.id).to.be.a('number');
            expect(data.id).to.be("0");
            expect(data.isAccountNonExpired).to.be.a('boolean');
            expect(data.isAccountNonExpired).to.be(false);
            expect(data.isAccountNonLocked).to.be.a('boolean');
            expect(data.isAccountNonLocked).to.be(false);
            expect(data.isCredentialsNonExpired).to.be.a('boolean');
            expect(data.isCredentialsNonExpired).to.be(false);
            expect(data.isEnabled).to.be.a('boolean');
            expect(data.isEnabled).to.be(false);
            expect(data.password).to.be.a('string');
            expect(data.password).to.be("");
            expect(data.tenant).to.be.a('string');
            expect(data.tenant).to.be("");
            expect(data.updateDate).to.be.a(Date);
            expect(data.updateDate).to.be(new Date());
            expect(data.username).to.be.a('string');
            expect(data.username).to.be("");

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('deleteUsingDELETE', function() {
        it('should call deleteUsingDELETE successfully', function(done) {
          // TODO: uncomment, update parameter values for deleteUsingDELETE call
          /*
          var clientId = 789;

          instance.deleteUsingDELETE(clientId, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getAllClientUsingGET', function() {
        it('should call getAllClientUsingGET successfully', function(done) {
          // TODO: uncomment, update parameter values for getAllClientUsingGET call and complete the assertions
          /*
          var opts = {};
          opts.ascending = false;
          opts.filter = "filter_example";
          opts.orderBy = "username";
          opts.page = 0;
          opts.size = 25;

          instance.getAllClientUsingGET(opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(HydrogenAdminApi.PageClient);
            {
              let dataCtr = data.content;
              expect(dataCtr).to.be.an(Array);
              expect(dataCtr).to.not.be.empty();
              for (let p in dataCtr) {
                let data = dataCtr[p];
                expect(data).to.be.a(HydrogenAdminApi.Client);
                expect(data.authorities).to.be.a('string');
                expect(data.authorities).to.be("");
                expect(data.createDate).to.be.a(Date);
                expect(data.createDate).to.be(2018-06-28T18:17:23.579+0000);
                expect(data.id).to.be.a('number');
                expect(data.id).to.be("0");
                expect(data.isAccountNonExpired).to.be.a('boolean');
                expect(data.isAccountNonExpired).to.be(false);
                expect(data.isAccountNonLocked).to.be.a('boolean');
                expect(data.isAccountNonLocked).to.be(false);
                expect(data.isCredentialsNonExpired).to.be.a('boolean');
                expect(data.isCredentialsNonExpired).to.be(false);
                expect(data.isEnabled).to.be.a('boolean');
                expect(data.isEnabled).to.be(false);
                expect(data.password).to.be.a('string');
                expect(data.password).to.be("");
                expect(data.tenant).to.be.a('string');
                expect(data.tenant).to.be("");
                expect(data.updateDate).to.be.a(Date);
                expect(data.updateDate).to.be(new Date());
                expect(data.username).to.be.a('string');
                expect(data.username).to.be("");

                      }
            }
            expect(data.first).to.be.a('boolean');
            expect(data.first).to.be(false);
            expect(data.last).to.be.a('boolean');
            expect(data.last).to.be(false);
            expect(data._number).to.be.a('number');
            expect(data._number).to.be(0);
            expect(data.numberOfElements).to.be.a('number');
            expect(data.numberOfElements).to.be(0);
            expect(data.size).to.be.a('number');
            expect(data.size).to.be(0);
            {
              let dataCtr = data.sort;
              expect(dataCtr).to.be.an(Array);
              expect(dataCtr).to.not.be.empty();
              for (let p in dataCtr) {
                let data = dataCtr[p];
                expect(data).to.be.a(HydrogenAdminApi.Sort);
                expect(data.ascending).to.be.a('boolean');
                expect(data.ascending).to.be(true);
                expect(data.descending).to.be.a('boolean');
                expect(data.descending).to.be(false);
                expect(data.direction).to.be.a('string');
                expect(data.direction).to.be("DESC");
                expect(data.ignoreCase).to.be.a('boolean');
                expect(data.ignoreCase).to.be(false);
                expect(data.nullHandling).to.be.a('string');
                expect(data.nullHandling).to.be("NATIVE");
                expect(data.property).to.be.a('string');
                expect(data.property).to.be("updateDate");

                      }
            }
            expect(data.totalElements).to.be.a('number');
            expect(data.totalElements).to.be("0");
            expect(data.totalPages).to.be.a('number');
            expect(data.totalPages).to.be(0);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getUsingGET', function() {
        it('should call getUsingGET successfully', function(done) {
          // TODO: uncomment, update parameter values for getUsingGET call and complete the assertions
          /*
          var clientId = 789;

          instance.getUsingGET(clientId, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(HydrogenAdminApi.Client);
            expect(data.authorities).to.be.a('string');
            expect(data.authorities).to.be("");
            expect(data.createDate).to.be.a(Date);
            expect(data.createDate).to.be(2018-06-28T18:17:23.579+0000);
            expect(data.id).to.be.a('number');
            expect(data.id).to.be("0");
            expect(data.isAccountNonExpired).to.be.a('boolean');
            expect(data.isAccountNonExpired).to.be(false);
            expect(data.isAccountNonLocked).to.be.a('boolean');
            expect(data.isAccountNonLocked).to.be(false);
            expect(data.isCredentialsNonExpired).to.be.a('boolean');
            expect(data.isCredentialsNonExpired).to.be(false);
            expect(data.isEnabled).to.be.a('boolean');
            expect(data.isEnabled).to.be(false);
            expect(data.password).to.be.a('string');
            expect(data.password).to.be("");
            expect(data.tenant).to.be.a('string');
            expect(data.tenant).to.be("");
            expect(data.updateDate).to.be.a(Date);
            expect(data.updateDate).to.be(new Date());
            expect(data.username).to.be.a('string');
            expect(data.username).to.be("");

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('updateUsingPUT', function() {
        it('should call updateUsingPUT successfully', function(done) {
          // TODO: uncomment, update parameter values for updateUsingPUT call and complete the assertions
          /*
          var client = new HydrogenAdminApi.Client();
          client.authorities = "";
          client.id = "0";
          client.isAccountNonExpired = false;
          client.isAccountNonLocked = false;
          client.isCredentialsNonExpired = false;
          client.isEnabled = false;
          client.password = "";
          client.tenant = "";
          client.updateDate = new Date();
          client.username = "";
          var clientId = 789;

          instance.updateUsingPUT(client, clientId, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(HydrogenAdminApi.Client);
            expect(data.authorities).to.be.a('string');
            expect(data.authorities).to.be("");
            expect(data.createDate).to.be.a(Date);
            expect(data.createDate).to.be(2018-06-28T18:17:23.579+0000);
            expect(data.id).to.be.a('number');
            expect(data.id).to.be("0");
            expect(data.isAccountNonExpired).to.be.a('boolean');
            expect(data.isAccountNonExpired).to.be(false);
            expect(data.isAccountNonLocked).to.be.a('boolean');
            expect(data.isAccountNonLocked).to.be(false);
            expect(data.isCredentialsNonExpired).to.be.a('boolean');
            expect(data.isCredentialsNonExpired).to.be(false);
            expect(data.isEnabled).to.be.a('boolean');
            expect(data.isEnabled).to.be(false);
            expect(data.password).to.be.a('string');
            expect(data.password).to.be("");
            expect(data.tenant).to.be.a('string');
            expect(data.tenant).to.be("");
            expect(data.updateDate).to.be.a(Date);
            expect(data.updateDate).to.be(new Date());
            expect(data.username).to.be.a('string');
            expect(data.username).to.be("");

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
    });
  });

}));

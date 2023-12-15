module.exports = app => {
  const inscriptions = require("../controllers/inscription.controller.js");

  var router = require("express").Router();

  // Create a new Inscription
  router.post("/add", inscriptions.create);

  // Retrieve all Inscriptions
  router.get("/getAllInscription", inscriptions.findAll);

  // Retrieve a single Inscription with id
  router.get("/getIncription/:id", inscriptions.findOne);

  // Update an Inscription with id
  router.put("/updateInscription/:id", inscriptions.update);

  // Delete an Inscription with id
  router.delete("/deleteInscription/:id", inscriptions.delete);

  app.use("/inscriptions", router);
};

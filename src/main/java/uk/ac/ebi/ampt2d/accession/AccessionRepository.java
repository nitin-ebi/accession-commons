/*
 * Copyright 2017 EMBL - European Bioinformatics Institute
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.ac.ebi.ampt2d.accession;

import java.util.List;
import java.util.Map;

/**
 * Accession repository
 *
 * @param <T> Object class
 */
public interface AccessionRepository<T> {
    /**
     * Given a list of objects, it returns the accessions for those objects that are stored in the repository
     *
     * @param objects List of objects to accession
     * @return Objects to accessions map, for the objects that are stored in the repository
     */
    Map<T, String> get(List<T> objects);

    /**
     * Add object-accession pairs to a repository
     *
     * @param accessions Objects to accessions map
     */
    void add(Map<T, String> accessions);
}

package com.performance.module_4_300

class Feature300UseCase2(
    private val repository: Feature300Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}

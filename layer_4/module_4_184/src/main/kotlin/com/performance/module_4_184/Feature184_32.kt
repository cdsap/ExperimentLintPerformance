package com.performance.module_4_184

class Feature184UseCase0(
    private val repository: Feature184Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
